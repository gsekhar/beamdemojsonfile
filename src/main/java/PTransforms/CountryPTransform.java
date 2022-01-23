package PTransforms;

import org.apache.beam.sdk.transforms.PTransform;
import org.apache.beam.sdk.transforms.ParDo;
import org.apache.beam.sdk.values.PCollection;

import Fn.CountryAverageFunction;
import model.Gdp;

public class CountryPTransform extends PTransform<PCollection<String>, PCollection<String>>{

	@Override
	public PCollection<String> expand(PCollection<String> gdpinput) {
		
		PCollection<String> gdp = gdpinput.apply(ParDo.of(new CountryAverageFunction()));
		return gdp;
	}

}
