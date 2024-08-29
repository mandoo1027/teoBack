package com.commerce.service.MNU.vo;

import com.commerce.comm.ResultVO;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
public class MNU0101S01R  {
	private List<MNUMenu> ADM;
	private List<MNUMenu> admMappingList;
}
