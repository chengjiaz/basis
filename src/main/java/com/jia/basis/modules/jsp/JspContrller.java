package com.jia.basis.modules.jsp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jia.basis.common.controller.BaseController;

/**
 * 
 * @author Administrator
 *
 */
@Controller
public class JspContrller extends BaseController {

	@RequestMapping(value = { "/indexJsp" })
	public String indexJsp() {
		logger.info("JspContrller|indexJsp|method|into");
		return "routeBase/index";
	}
	@RequestMapping(value = { "/upLoadjsp" })
	public String upLoadjsp() {
		logger.info("JspContrller|upLoadjsp|method|into");
		return "upload/upload";
	}
	/**
	 * 日期:2019-6-10
	 * add by zjc
	 * 功能案例:九宫格。
	 * 页面跳转
	 */
	@RequestMapping(value = { "/Jiugongge" })
	public String Jiugongge() {

		return "jiugongge/jiugongge";
	}
}
