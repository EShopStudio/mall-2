package com.perenc.mall.platform.entity.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @ClassName: RelatedPlateActionDO
 * @Description: 板块——活动
 *
 * @Author: GR
 * @Date: 2019/9/18 19:07 
 *
 * Modification History:
 * Date         Author      Description
 *---------------------------------------------------------*
 * 2019/9/18     GR     		
 */
@Data
@Accessors(chain = true)
@NoArgsConstructor(staticName = "build")
@TableName(value = "platform_plate_action")
public class RelatedPlateActionDO {
    @TableField("plate_id")
    private Integer plateId;
    @TableField("action_id")
    private Integer actionId;
    @TableField("create_user")
    private String createUser;
    @TableField("update_user")
    private String updateUser;
    @TableField("create_time")
    private String createTime;
    @TableField("update_time")
    private String updateTime;
}
