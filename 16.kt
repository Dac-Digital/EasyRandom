public class EmailRandomizer implements Randomizer<String> {
 public String getRandomValue() {
     // generate a random alphanumeric string of length 10 for the username part of the email address
     String username = RandomStringUtils
             .randomAlphanumeric(10);
     // generate a random top-level domain from a list of popular ones
     String[] tlds = {"com", "net", "org", "gov", "edu"};
     String tld = tlds[new Random().nextInt(tlds.length)];
     // return the random email address
     return username + "@" + tld;
 }
}
