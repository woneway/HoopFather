package com.woneway.controller;

import javax.mail.MessagingException;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.woneway.domain.User;
import com.woneway.error.user.userErrorInfoEnum;
import com.woneway.exception.GlobalErrorInfoException;
import com.woneway.result.ResultBody;
import com.woneway.service.UserService;
import com.woneway.utils.MailUtil;
import com.woneway.utils.UUIDUtils;

/**
 * UserController Description: author: woneway 2018年4月9日
 */
@Controller
@RequestMapping("/usr")
public class UserController {
	@Autowired
	UserService userService;

	@RequestMapping("/register")
	public String registerPage() {
		return "register";
	}

	@RequestMapping("/login")
	public String loginPage() {
		return "login";
	}

	/**
	 * @param user
	 * @return
	 * @throws GlobalErrorInfoException
	 *             用户登录： 校验账号、密码是否为空 校验账号密码是否匹配
	 */
	@ResponseBody
	@RequestMapping(value = "/doLogin")
	public ResultBody login(User user, HttpSession session) throws GlobalErrorInfoException {
		String userEmail = user.getUserEmail();
		String userPwd = user.getUserPwd();
		// return userService.login(userEmail,userPwd);
		if (StringUtils.isEmpty(userEmail))
			throw new GlobalErrorInfoException(userErrorInfoEnum.USEREMAIL_NO_COMPLETE);
		else if (StringUtils.isEmpty(userPwd))
			throw new GlobalErrorInfoException(userErrorInfoEnum.USERPWD_NO_COMPLETE);
		User rs = userService.login(userEmail, userPwd);
		if (rs == null)
			throw new GlobalErrorInfoException(userErrorInfoEnum.INVALID_GRANT);
		if (rs.getUserState() != 1)
			throw new GlobalErrorInfoException(userErrorInfoEnum.USER_NO＿VALIDATE);
		session.setAttribute("user", rs);

		return new ResultBody(1);
	}

	@RequestMapping(value = "/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("user");
		return "login";
	}

	@ResponseBody
	@RequestMapping(value = "/doRegister")
	public ResultBody register(User user, @Param("userPwd2") String userPwd2)
			throws MessagingException, GlobalErrorInfoException {
		if (StringUtils.isEmpty(user.getUserEmail()))
			throw new GlobalErrorInfoException(userErrorInfoEnum.USEREMAIL_NO_COMPLETE);
		if (StringUtils.isEmpty(user.getUserName()))
			throw new GlobalErrorInfoException(userErrorInfoEnum.USEREMAIL_NO_COMPLETE);
		if (StringUtils.isEmpty(user.getUserPwd()))
			throw new GlobalErrorInfoException(userErrorInfoEnum.USERPWD_NO_COMPLETE);
		if (!user.getUserPwd().equals(userPwd2))
			throw new GlobalErrorInfoException(userErrorInfoEnum.USERPWD_NO_SAME);
		String userCode = UUIDUtils.getUUID();
		user.setUserCode(userCode);
		user.setUserState(0);
		int rs = userService.register(user);
		if (rs == 1)
			MailUtil.send_mail(user.getUserEmail(), user.getUserCode());
		return new ResultBody(rs);
	}

	@RequestMapping(value = "/doAcitveUser")
	public String acitveUser(@Param("userCode") String userCode) {
		User user = userService.getByUserCode(userCode);
		if (user == null || user.getUserCode() == null)
			return "register";

		user.setUserCode("");
		user.setUserState(1);
		userService.updateUserInfo(user);
		return "index";
	}

	@RequestMapping("/userInfo")
	public String userInfoPage() {
		return "userInfo";
	}
}
