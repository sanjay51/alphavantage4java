# alphavantage4java
Alphavantage API generic Java wrapper. Easy to use and extend.

You should first obtain a key from Alphavantage API - https://www.alphavantage.co/support/#api-key

## Example - Fetch Earnings
```java
# Create API object
AlphavantageAPI api = new AlphavantageAPI("0VYAF36W7SUE75W8"); // replace with your own key

# Invoke
JSONObject obj = api.fetch("EARNINGS", Map.of("symbol", "IBM"));

# Use
System.out.println(obj.toString());
```

Result:
```json
{
  "quarterlyEarnings": [
    {
      "surprise": "0.0416",
      "surprisePercentage": "1.8179",
      "reportedDate": "2021-07-19",
      "estimatedEPS": "2.2884",
      "fiscalDateEnding": "2021-06-30",
      "reportedEPS": "2.33"
    },
    {
      "surprise": "0.1176",
      "surprisePercentage": "7.1169",
      "reportedDate": "2021-04-19",
      "estimatedEPS": "1.6524",
      "fiscalDateEnding": "2021-03-31",
      "reportedEPS": "1.77"
    },
```
...

## Example 2 - Time Series Intraday Data
```java
# Create API object
AlphavantageAPI api = new AlphavantageAPI("0VYAF36W7SUE75W8"); // replace with your own key

# Invoke
JSONObject obj = api.fetch("TIME_SERIES_INTRADAY", 
                            Map.of(
                                 "symbol", "IBM",
                                 "interval", "5min"
                            ));

# Use
System.out.println(obj.toString());
```

Result:
```json
{
  "Time Series (5min)": {
    "2021-07-30 15:15:00": {
      "3. low": "141.0500",
      "5. volume": "37800",
      "1. open": "141.0700",
      "2. high": "141.1600",
      "4. close": "141.1400"
    },
    "2021-07-30 12:30:00": {
      "3. low": "141.2200",
      "5. volume": "11063",
      "1. open": "141.2700",
      "2. high": "141.2900",
      "4. close": "141.2200"
    },
```
...

The API returns a json object which you can use and transform as needed.

## Installation
Please see https://jitpack.io/#sanjay51/alphavantage4java/v1.0.2

Latest release: [![](https://jitpack.io/v/sanjay51/alphavantage4java.svg)](https://jitpack.io/#sanjay51/alphavantage4java)

### Maven:
	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
  ..

	<dependency>
	    <groupId>com.github.sanjay51</groupId>
	    <artifactId>alphavantage4java</artifactId>
	    <version>v1.0.2</version>
	</dependency>
### Gradle:
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  ..

	dependencies {
	        implementation 'com.github.sanjay51:alphavantage4java:v1.0.2'
	}
