package Executors;

import java.io.IOException;

import org.apache.beam.sdk.Pipeline;
import org.apache.beam.sdk.io.TextIO;
import org.apache.beam.sdk.options.PipelineOptions;
import org.apache.beam.sdk.options.PipelineOptionsFactory;

import Options.CountryOptionsInt;
import PTransforms.CountryPTransform;

public class CountryExecutor {

	public static void main(String[] args) throws InterruptedException, IOException{
		
		CountryOptionsInt countryoptions = PipelineOptionsFactory.fromArgs(args).withoutStrictParsing().as(CountryOptionsInt.class);
		runCountryAvg(countryoptions);

	}

	private static void runCountryAvg(CountryOptionsInt countryoptions) throws InterruptedException{

		Pipeline indpipeline = Pipeline.create(countryoptions);
		
		indpipeline.apply(TextIO.read().from(countryoptions.getInputFile()))
		.apply(new CountryPTransform())
		.apply(TextIO.write().to(countryoptions.getOutputFile()));
		
		indpipeline.run().waitUntilFinish();
	}

}
