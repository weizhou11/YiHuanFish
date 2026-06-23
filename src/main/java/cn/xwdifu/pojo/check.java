package cn.xwdifu.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class check {

    /*
     * 定义编译变量数据
     * */

    //鼠标点击区域坐标
    private int mouse_X;//左上角的横坐标
    private int mouse_Y;//左上角的纵坐标
    private int mouse_x; //横坐标长度数值
    private int mouse_y;//纵坐标长度数值


    //钓鱼进度检测区域的坐标变量
    private int keyboard_X;//左上角的横坐标
    private int keyboard_Y;//左上角的纵坐标
    private int keyboard_x;//横坐标长度数值
    private int keyboard_y;//纵坐标长度数值


    //定义移动条的颜色变量区间（十六进制）
    private String bar_color_min;//最小值
    private String bar_color_max;//最大值


    //定义光标的颜色变量区间（十六进制）
    private String cursor_color_min;//最小值
    private String cursor_color_max;//最大值




    /*
     * 定义运行变量数据
     * */


    // ===== 鼠标移动模拟配置 =====
    private int MOUSE_MOVE_STEPS;
    private int MIN_START_DELAY_MS;
    private int MAX_START_DELAY_MS;
    private int MIN_STOP_DELAY_MS;
    private int MAX_STOP_DELAY_MS;

    // ===== 键盘输入延迟配置 =====
    private int KEYBOARD_STOP_MIN_DELAY_MS;
    private int KEYBOARD_STOP_MAX_DELAY_MS;
    private int KEYBOARD_RESTART_MIN_DELAY_MS;
    private int KEYBOARD_RESTART_MAX_DELAY_MS;


}
