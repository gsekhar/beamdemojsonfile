package Executors;

import org.apache.beam.sdk.Pipeline;
import org.apache.beam.sdk.io.TextIO;
import org.apache.beam.sdk.values.PCollection;

public class TextIOExecuter {
	
	public static void main(String[] args) {
		
		Pipeline pipeline = Pipeline.create();
		
		PCollection<String> pcollection = pipeline.apply(TextIO.read().from("C:\\D-Drive\\ApacheBeam\\apachebeam-workspace\\coxbeamdemojsonfile\\src\\main\\resources\\gdp.json"));
		
		pcollection.apply(TextIO.write().to("C:\\D-Drive\\ApacheBeam\\apachebeam-workspace\\coxbeamdemojsonfile\\src\\main\\resources\\output\\gdpoutput.json"));
		
		pipeline.run();
	}

}
