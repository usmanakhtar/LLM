package org.uclab.mm.dcl.llm;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/llm")
public class LLMController {

	@Path("/")
	@GET
	public String getIt() {
		return "noor singa yea?";
	}
}
