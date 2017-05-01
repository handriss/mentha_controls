package com.mentha.model;


import com.mentha.model.enums.RoomTypeEnum;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class TransferObject {

    private String name;
    private Boolean widgetStatus;
    private RoomTypeEnum roomTypeEnum;

}
