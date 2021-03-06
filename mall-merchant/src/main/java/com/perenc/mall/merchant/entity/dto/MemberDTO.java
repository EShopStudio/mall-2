package com.perenc.mall.merchant.entity.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @ClassName: MemberDTO
 * @Description: 前端上传的会员相关信息数据
 *
 * @Author: GR
 * @Date: 2019/9/20 11:19 
 *
 * Modification History:
 * Date         Author      Description
 *---------------------------------------------------------*
 * 2019/9/20     GR     		
 */
@Data
@Accessors(chain = true)
@NoArgsConstructor(staticName = "build")
public class MemberDTO {
    private Integer id;
    @NotBlank(message = "nickname不能为空")
    private String nickname;
    @NotBlank(message = "phone不能为空")
    private String phone;
    @Min(0)
    private Integer coin;
    @Min(0)
    private Integer level;
    private Integer status;
    // 店铺会员特有属性
    private Integer storeId;
}
