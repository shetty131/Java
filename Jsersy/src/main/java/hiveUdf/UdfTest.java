package hiveUdf;

import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;

public class UdfTest extends UDF{

public Text evaluate(Text input)
{
	
	
	return input;
	
}
	
}
