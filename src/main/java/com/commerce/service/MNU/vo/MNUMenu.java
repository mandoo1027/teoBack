package com.commerce.service.MNU.vo;

import lombok.Data;

import java.util.List;

@Data
public class MNUMenu  implements Comparable<MNUMenu> {
    private String fileCtn;
    private String filePath;
    private String lastChgDt;
    private String lastUserId;
    private String loginYn;
    private String logoCss;
    private String menuCode;
    private String menuCss;
    private String menuDepth;
    private String menuScrDev;
    private String menuName;
    private List<String> navigator;
    private String menuSeq;
    private String rgtrDt;
    private String rgtrUserId;
    private String sysDivCd;
    private String upperMenuCode;
    private String useEndDate;
    private String useStrtDate;
    private String useYn;
    private List<MNUMenu> children;
    private String scrCtn;
    private String useInstDiv;

    @Override
    public int compareTo(MNUMenu other) {
        // upperMenuCode가 없는 경우를 우선순위로 처리
        if(this.upperMenuCode == null && other.upperMenuCode != null) {
            return -1;
        }

        if(this.upperMenuCode != null && other.upperMenuCode == null) {
            return 1;
        }

        Integer currentSeq = Integer.parseInt(this.menuSeq);
        Integer otherSeq = Integer.parseInt(other.menuSeq);

        return currentSeq.compareTo(otherSeq);
    }
}
