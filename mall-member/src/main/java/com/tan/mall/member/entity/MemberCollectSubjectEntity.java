package com.tan.mall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 会员收藏的专题活动
 *
 * @author arctan95
 * @email tanzhq1995@gmail.com
 * @date 2020-10-10 22:34:31
 */
@Data
@TableName("ums_member_collect_subject")
public class MemberCollectSubjectEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId
    private Long id;
    /**
     * subject_id
     */
    private Long subjectId;
    /**
     * subject_name
     */
    private String subjectName;
    /**
     * subject_img
     */
    private String subjectImg;
    /**
     * 活动url
     */
    private String subjectUrll;

}
