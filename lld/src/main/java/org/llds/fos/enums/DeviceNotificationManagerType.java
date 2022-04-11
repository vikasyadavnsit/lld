package org.llds.fos.enums;

import java.util.Arrays;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum DeviceNotificationManagerType {
  FCM(Arrays.asList(DeviceType.ANDROID_SMARTPHONE, DeviceType.CHROME_WEB_BROWSER)),
  APN(Arrays.asList(DeviceType.MACOS, DeviceType.IOS_SMARTPHONE)),
  OTHER(Arrays.asList());

  List<DeviceType> supportedDeviceTypes;

}
