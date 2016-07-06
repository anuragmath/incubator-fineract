/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.fineract.portfolio.loanaccount.domain;

public enum PdcPresentationEnumOption {
	INVALID(0, "pdcPresentationStatus.invalid"), //
	NOT_RECEIVED(1, "pdcPresentationStatus.notReceived"), //
	VERIFIED_AND_RECEIVED(2, "pdcPresentationStatus.verifiedAndReceived"), //
	BANKED_AND_IN_PROCESS(3, "pdcPresentationStatus.bankedAndInProcess"), //
	BANKED_AND_CLEARED(4, "pdcPresentationStatus.bankedAndCleared"), //
	BANKED_AND_BOUNCED(5, "pdcPresentationStatus.bankedAndBounced"), //
	SWAPPED(6, "pdcPresentationStatus.swapped");
	
	private final Integer value;
	private final String code;
	
	private PdcPresentationEnumOption(final Integer value, final String code) {
		this.value = value;
		this.code = code;
	}
	
	public Integer getValue() {
	     return this.value;
	}

	public String getCode() {
	     return this.code;
	}
	
	public static PdcPresentationEnumOption fromInt(final Integer presentationStatus){
		
		if(presentationStatus == null) { return PdcPresentationEnumOption.INVALID; }
		
		PdcPresentationEnumOption pdcPresentationStatus = null;
		switch (presentationStatus) {
		case 1:
			pdcPresentationStatus = PdcPresentationEnumOption.NOT_RECEIVED;	
		break;
		case 2:
			pdcPresentationStatus = PdcPresentationEnumOption.VERIFIED_AND_RECEIVED;
		break;
		case 3:
			pdcPresentationStatus = PdcPresentationEnumOption.BANKED_AND_IN_PROCESS;
		break;
		case 4:
			pdcPresentationStatus = PdcPresentationEnumOption.BANKED_AND_CLEARED;
		break;
		case 5: 
		        pdcPresentationStatus = PdcPresentationEnumOption.BANKED_AND_BOUNCED;
		break;
		case 6:
		        pdcPresentationStatus = PdcPresentationEnumOption.SWAPPED;
		break;
		default:
			pdcPresentationStatus = PdcPresentationEnumOption.INVALID;
		break;
		}
	return pdcPresentationStatus;
	}
	
	public boolean isInvalid(){
		return this.value.equals(PdcPresentationEnumOption.INVALID.getValue());
	}
	
	public boolean isNotRecieved(){
		return this.value.equals(PdcPresentationEnumOption.NOT_RECEIVED.getValue());
	}
	
	public boolean isVerifiedAndReceived(){
		return this.value.equals(PdcPresentationEnumOption.VERIFIED_AND_RECEIVED.getValue());
	}
	
	public boolean isBankedAndInProcess(){
            return this.value.equals(PdcPresentationEnumOption.BANKED_AND_IN_PROCESS.getValue());
	}
	
	public boolean isBankedAndCleared(){
		return this.value.equals(PdcPresentationEnumOption.BANKED_AND_CLEARED.getValue());
	}
	
	public boolean isBankedAndDeclined(){
		return this.value.equals(PdcPresentationEnumOption.BANKED_AND_BOUNCED.getValue());
	}
	
	public boolean isSwapped(){
            return this.value.equals(PdcPresentationEnumOption.SWAPPED.getValue());
    }
}