package Fn;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.beam.sdk.transforms.DoFn;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import model.Country;
import model.Gdp;

public class CountryAverageFunction extends DoFn<String, String> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3977979392107799987L;

	@ProcessElement
    public void processElement(ProcessContext c) {
		
		/*
		 * for(String word: c.element().split(",")) { if(word.contains("IND")){
		 * System.out.println("Matched  with IND==" +word+" at = " +c.timestamp());
		 * c.output(word); } }
		 */
		
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		try {
			List<Gdp> gdpjsonlist = objectMapper.readValue(c.element(), new TypeReference<List<Gdp>>(){});
			
			System.out.println(gdpjsonlist.size());
			List<Gdp> indgdpjsonlist = gdpjsonlist.stream().filter(gdp -> gdp.getCountryiso3code().equalsIgnoreCase("IND")).collect(Collectors.toList());
			
			System.out.println(indgdpjsonlist.size());
			c.output(objectMapper.writeValueAsString(indgdpjsonlist));
			/*
			 * ArrayList<Gdp> gdplist = new ArrayList<Gdp>(); for(Gdp gdp: gdpjsonlist) {
			 * 
			 * }
			 */
			
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
    }
}
