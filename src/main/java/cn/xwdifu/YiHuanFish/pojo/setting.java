package cn.xwdifu.YiHuanFish.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class setting {


    //==配置文件==
    private String congfig_file_name;//配置文件名称
    private String congfig_file_path;//配置文件路径

    //==内存配置==
    private int max_memory_size;

}
