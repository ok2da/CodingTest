class Solution {
	public String solution(String code) {
		int mode = 0;
		char a;
		StringBuilder ret = new StringBuilder();

		for (int idx = 0; idx < code.length(); idx++) {
			a = code.charAt(idx); // code.charAt(idx) == code[idx]

			// mode가 0일때
			if (mode == 0) {
				// c가 1이 아닐떄
				if (a != '1') {
					// idx가 짝수일때
					if (idx % 2 == 0) {
						// ret에 code[idx] 입력
						ret.append(a);
					}
				} else {
					mode = 1;
				}

			} else if (mode == 1) {

				if (a != '1') {
					if (idx % 2 == 1) {
						ret.append(a);
					}
				} else {
					mode = 0;
				}

			}
		}
		if (ret.length() == 0) {
			return "EMPTY";

		} else {
			return ret.toString();
		}
	}
}