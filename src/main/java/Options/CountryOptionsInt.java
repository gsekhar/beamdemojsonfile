package Options;

import org.apache.beam.sdk.options.Default;
import org.apache.beam.sdk.options.Description;
import org.apache.beam.sdk.options.PipelineOptions;

public interface CountryOptionsInt extends PipelineOptions{

	@Description("Path to the input file")
    @Default.String("./src/main/resources/gdp.json")
    String getInputFile();
    void setInputFile(String value);

    @Description("Path to the output file")
    @Default.String("./src/main/resources/output/outputjson.json")
    String getOutputFile();
    void setOutputFile(String value);
}
