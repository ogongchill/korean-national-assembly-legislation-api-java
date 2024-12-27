package com.ogongchill.nationalAssembly.core.api;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.ogongchill.nationalAssembly.TestUtils;
import com.ogongchill.nationalAssembly.core.request.*;
import com.ogongchill.nationalAssembly.core.response.*;
import com.ogongchill.nationalAssembly.core.response.billAdditionalInfo.BillAdditionalInfoResponse;
import com.ogongchill.nationalAssembly.core.response.billCommissionExaminationInfo.BillCommissionExaminationInfoResponse;
import com.ogongchill.nationalAssembly.core.code.PlenarySessionResultCode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.ogongchill.nationalAssembly.core.code.BillKindCode;
import com.ogongchill.nationalAssembly.core.code.ProposerCode;

import okhttp3.OkHttpClient;

class NationalAssemblyLegislationServiceTest {

    private NationalAssemblyLegislationApi api;

	@BeforeEach
	public void setUp() {
        String serviceKey = TestUtils.readKey();
        OkHttpClient client = new OkHttpClient();
		api = NationalAssemblyLegislationService.from(serviceKey, client);
	}

	@DisplayName("의안 목록 검색")
	@Test
	void getBillInfoList() {
		BillInfoListRequest request = BillInfoListRequest.builder()
			.proposerCode(ProposerCode.F01)
			.bProcResultCd(PlenarySessionResultCode.E01)
			.endProposeDate("2024-12-25")
			.startProposeDate("2024-11-25")
			.startOrdinal(22)
			.endOrdinal(22)
			.numOfRows(100)
			.build();
		BillInfoListResponse response = api.getBillInfoList(request);
		System.out.println(response.toString());
		assertNotNull(response);
	}

	@DisplayName("최근 접수의안 목록 정보 조회")
	@Test
	void getRecentRceptList() {
		RecentRceptListRequest request = RecentRceptListRequest.builder()
			.numOfRows(100)
			.pageNo(1)
			.build();
		RecentRceptListResponse response = api.getRecentRceptList(request);
		System.out.println(response.toString());
		assertNotNull(response);
	}

	@DisplayName("최근 통과의안 목록 정보 조회")
	@Test
	void getRecentPasageList() {
		RecentPasageListRequest request = RecentPasageListRequest.builder()
			.pageNo(1)
			.build();
		RecentPasageListResponse response = api.getRecentPasageList(request);
		System.out.println(response.toString());
		assertNotNull(response);
	}

	@DisplayName("처리의안 목록 정보 조회")
	@Test
	void getJsictionComiteProcessList() {
		JsictionComiteProcessListRequest request = JsictionComiteProcessListRequest.builder()
			.startAgeCode(22)
			.billKindCd(BillKindCode.B04)
			.build();
		JsictionComiteProcessListResponse response = api.getJsictionComiteProcessList(request);
		System.out.println(response.toString());
		assertNotNull(response);
	}

	@DisplayName("계류의안 목록 정보 조회")
	@Test
	void getRecentMoorList() {
		RecentMoorListRequest request = RecentMoorListRequest.builder()
			.billKindCode(BillKindCode.B02)
			.startAgeCode(22)
			.pageNo(1)
			.numOfRows(100)
			.build();
		RecentMoorListResponse response = api.getRecentMoorList(request);
		System.out.println(response.toString());
		assertNotNull(response);
	}

	@DisplayName("본회의부의요청안건 목록 정보 조회")
	@Test
	void getSessionRequestList() {
		SessionRequestListRequest request = SessionRequestListRequest.builder()
			.billKindCode(BillKindCode.B04)
			.startAgeCode(22)
			.pageNo(1)
			.numOfRows(100)
			.build();
		SessionRequestListResponse response = api.getSessionRequestList(request);
		System.out.println(response.toString());
		assertNotNull(response);
	}

	@DisplayName("의안 접수 정보 조회")
	@Test
	void getBillReceiptInfo() {
		BillReceiptInfoRequest request = new BillReceiptInfoRequest("PRC_X2X4V1W1V0V6D2D0C1A4B2Z3A6I3I7");
		BillReceiptInfoResponse response = api.getBillReceiptInfo(request);
		System.out.println(response.toString());
		assertNotNull(response);
	}

	@DisplayName("의안/청원 접수정보 국회의원 목록 조회")
	@Test
	void getBillPetitionMemberList() {
		BillPetitionMemberListRequest request = BillPetitionMemberListRequest.builder()
			.billId("PRC_X2X4V1W1V0V6D2D0C1A4B2Z3A6I3I7")
			.gbn1("bill")
			.gbn2("reception")
			.build();
		BillPetitionMemberListResponse response = api.getBillPetitionMemberList(request);
		System.out.println(response.toString());
		assertNotNull(response);
	}

	@DisplayName("의안 공포 정보 조회")
	@Test
	void getBillPromulgationInfo() {
		BillPromulgationInfoRequest request = new BillPromulgationInfoRequest("PRC_X2X4V1W1V0V6D2D0C1A4B2Z3A6I3I7");
		BillPromulgationInfoResponse response = api.getBillPromulgationInfo(request);
		System.out.println(response.toString());
		assertNotNull(response);
	}

	@DisplayName("의안 부가 정보 조회")
	@Test
	void getBillAdditionalInfo() {
		BillAdditionalInfoRequest request = new BillAdditionalInfoRequest("PRC_X2X4V1W1V0V6D2D0C1A4B2Z3A6I3I7");
		BillAdditionalInfoResponse response = api.getBillAdditionalInfo(request);
		System.out.println(response.toString());
		assertNotNull(response);
	}

	@DisplayName("의안 위원회심사 정보조회")
	@Test
	void getBillCommissionExaminationInfo() {
		BillCommissionExaminationInfoRequest request = new BillCommissionExaminationInfoRequest("PRC_X2X4V1W1V0V6D2D0C1A4B2Z3A6I3I7");
		BillCommissionExaminationInfoResponse response = api.getBillCommissionExaminationInfo(request);
		System.out.println(response.toString());
		assertNotNull(response);
	}

	@DisplayName("소관위원회 정보조회")
	@Test
	void getCommitPetitionList() {
		CommitPetitionListRequest request = CommitPetitionListRequest.builder()
				.startAgeCode(22)
				.build();
		CommitPetitionListResponse response = api.getCommitPetitionList(request);
		System.out.println(response);
		assertNotNull(response);
	}

	@DisplayName("발의법률안 목록 정보조회")
	@Test
	void getMotionLawList() {
		MotionLawListRequest request = MotionLawListRequest.builder()
				.startOrdinal(22)
				.endOrdinal(22)
				.memName("이재명")
				.build();
		MotionLawListResponse response = api.getMotionLawList(request);
		System.out.println(response);
		assertNotNull(response);
	}
}