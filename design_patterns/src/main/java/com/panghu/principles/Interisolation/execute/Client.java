package com.panghu.principles.Interisolation.execute;


/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/10 15:12
 * @description
 */
public class Client {
    public static void main(String[] args) {
        PanghuSafetyDoor door = new PanghuSafetyDoor();
        door.antiTheft();
        door.fireProof();
        door.waterProof();
        System.out.println("-================--");
        CuihuaSafetyDoor cuihuaSafetyDoor = new CuihuaSafetyDoor();
        cuihuaSafetyDoor.antiTheft();
        cuihuaSafetyDoor.waterProof();
    }

}
