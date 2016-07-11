package org.apache.fineract.portfolio.loanaccount.domain;

public enum PdcTypeEnumOption {
	
	INVALID(0, "pdcType.invalid"), //
	FULL_PDC(1, "pdcType.fullPdc"), //
	SECURITY_PDC(2, "pdcType.securityPdc"), //
	PARTIAL_PDC(3, "pdcType.partialPdc");
	
	private final Integer value;
	private final String code;
	
	private PdcTypeEnumOption(final Integer value, final String code){
		this.value = value;
		this.code = code;
	}
	
	public Integer getValue() {
	     return this.value;
	}

	public String getCode() {
	     return this.code;
	}

	public static PdcTypeEnumOption fromInt(final Integer pdcTypeValue) {
		if(pdcTypeValue == null) { return PdcTypeEnumOption.INVALID; }
	
		PdcTypeEnumOption pdcType = null;
		switch (pdcTypeValue) {
		case 1:
			pdcType = PdcTypeEnumOption.FULL_PDC;
			break;
		case 2:
			pdcType = PdcTypeEnumOption.SECURITY_PDC;
			break;
		case 3:
                    pdcType = PdcTypeEnumOption.PARTIAL_PDC;
                    break;
		default:
			pdcType = PdcTypeEnumOption.INVALID;
			break;
		}
		return pdcType;
	}
	
	public boolean isFullPdc(){
		return this.value.equals(PdcTypeEnumOption.FULL_PDC.getValue());
	}
	
	public boolean isSecurityPdc(){
		return this.value.equals(PdcTypeEnumOption.SECURITY_PDC.getValue());
	}
	
	public boolean isPartialPdc(){
            return this.value.equals(PdcTypeEnumOption.PARTIAL_PDC.getValue());
    }
	
	public boolean isInvalid(){
		return this.value.equals(PdcTypeEnumOption.INVALID.getValue());
	}
}
