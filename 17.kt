@Test
void shouldGenerateUserWithProperFields(){
//when
     User3 user = randomUser3();
     //then
     assertThat(user.getEmail()).isNotNull().contains("@");
     assertThat(user.getFirstName().length()).isBetween(3,5);
     // preview
     System.out.println(user.toString());
}

private User3 randomUser3(){
     EasyRandomParameters parameters = new EasyRandomParameters()
             .randomize(field->
                     field.getName().equals("email"),
                     new EmailRandomizer())
             .randomize(field->
                     field.getName().equals("firstName"),
                     new StringRandomizer(
minLength: 3,
maxLength: 5,
      seed: 10));
     EasyRandom easyRandom = new EasyRandom(parameters);
     return easyRandom.nextObject(User3.class);
}
