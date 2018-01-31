package org.account.com.mapper;

import org.account.com.model.ObjectModel;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ObjMapper {

    @Select({
            "select c.`names` jzmc,d.P11 ywgy,d.P12 ywhy,d.P21 ewgy,d.P22 ewhy" +
                    ",d.T11 ywgw,d.T12 ywhw,d.T21 ewgw,d.T22 ewhw" +
                    " from datas_2_table d " +
                    "left join crew_table c on c.uuid = d.jzid " +
                    "where d.dates = (select MAX(dates) from datas_2_table) order by CONVERT(c.`names` USING gbk)"
    })
    List<ObjectModel> findAll();
}
