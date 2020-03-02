package com.demo.demo.hivedao;

import com.demo.demo.entity.BsSgmt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface HiveBsSgmtRepo extends JpaRepository<BsSgmt, Long>, JpaSpecificationExecutor<BsSgmt> {

	@Query("from BsSgmt where id = ?1 and (listDataStatus=?2 or listActionType=?3)")
	BsSgmt findBsSgmtByIdAndListdataStatusOrListActionType(Long id, int ListDataStatus, String ListactionType);

	@Query("from BsSgmt where name = ?1 and idType = ?2 and idNum = ?3 and infSurcCode = ?4 and invalid = ?5")
	List<BsSgmt> findBsSgmtByNameAndListdataStatusOrListActionType(String name, String idType, String idNum,
                                                                   String infSurcCode, int invalid);

    Long countByNameAndIdTypeAndIdNumAndInvalidAndIdNot(String name, String idType, String idNum, int effective,
                                                        Long id);

    Long countByNameAndIdTypeAndIdNumAndInvalid(String name, String idType, String idNum, int effective);

	/**
	 * 根据 标识类型 标识号码 获取 个人基本信息数量
	 * @param idType
	 * @param idNum
	 * @param effective
	 * @param ListDataStatus
	 * @return
	 */
	Long countByIdTypeAndIdNumAndInvalidAndListDataStatusIn(String idType, String idNum, int effective, List<Integer> ListDataStatus);
}