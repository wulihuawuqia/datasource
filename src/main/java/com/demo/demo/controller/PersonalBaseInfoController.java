package com.demo.demo.controller;

import com.demo.demo.dao.BsSgmtRepo;
import com.demo.demo.entity.BsSgmt;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 
 * 个人基本信息控制层
 *
 * <p>
 * 〈功能详细描述〉
 * @author jc.tan 2018年6月12日
 * @see
 * @since 1.0
 */
@RestController
@RequestMapping(value = "/personalBaseInfo")
@Log4j2
public class PersonalBaseInfoController {

	@Autowired
    BsSgmtRepo bsSgmtRepo;

	@Autowired
	@Qualifier("hiveJdbcTemplate")
	private JdbcTemplate hiveJdbcTemplate;

	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
	}

	// 规则: 查,删 操作接口使用RequestMethod.GET，失败情况可以重复请求
	// 增，改使用RequestMethod.POST，不能重复请求
	// 为降低难度与兼容性， DELETE,PUT等操作不用。

	/**
	 * 根据参数获取数据
	 * @return
	 */
	@RequestMapping(value = "/getMore", method = RequestMethod.GET)
	public List<BsSgmt> getMore() {
		return bsSgmtRepo.findAll();
	}

    /**
     * 根据参数获取数据
     * @return
     */
    @RequestMapping(value = "/getHiveMore", method = RequestMethod.GET)
    public List<Map<String, Object>> getHiveMore() {
        String sql = "select * from t_icirs_bs_sgmt";
        List<Map<String, Object>> list = hiveJdbcTemplate.queryForList(sql);
        return list;
    }

}
