package com.commerce.service.COM.vo;

import com.commerce.service.MNU.vo.MNUMenu;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
public class ADM0202S01R {
	private List<MNUMenu> ADM;
	private List<MNUMenu> admMappingList;
}
