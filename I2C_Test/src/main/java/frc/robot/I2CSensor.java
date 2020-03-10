/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.I2C;

/**
 * Add your docs here.
 */
public class I2CSensor {

    private I2C sensor;
    

    public void I2C(int address) {
        this.sensor = new I2C(I2C.Port.kOnboard, (address >> 1) | 0x00);
    }
    //public static I2C ultra_ir1 = new I2C(I2C.Port.kOnboard, 0x12);
    //public static I2C ultra_ir2 = new I2C(I2C.Port.kOnboard, 0x10);


}
