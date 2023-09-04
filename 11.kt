@Test
void generateCollectionsOfSimpleDataWithSize(){
     List<Long> longs = new EasyRandom()
.longs(streamSize:10)
.boxed()
.toList();

     assertThat(longs.size()).isEqualTo(10);
     System.out.println(longs);
}
