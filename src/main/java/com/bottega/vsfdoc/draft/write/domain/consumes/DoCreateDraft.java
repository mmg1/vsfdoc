package com.bottega.vsfdoc.draft.write.domain.consumes;

import com.bottega.vsfdoc.shared.QDocId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Value;


@Value
public class DoCreateDraft {
	private final String qDocType;
	private final QDocId qDocId;

}
