package com.jia.basis.modules.jsp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * @author zhangjiacheng
 * @description: JspContrller
 * @date 2019/7/2 17:05
 */

@Controller
@Slf4j
public class JspContrller  {

	@RequestMapping(value = { "/indexJsp" })
	public String indexJsp() {
		log.info("JspContrller|indexJsp|method|into");
		return "routeBase/index";
	}
	@RequestMapping(value = { "/upLoadjsp" })
	public String upLoadjsp() {
		log.info("JspContrller|upLoadjsp|method|into");
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
