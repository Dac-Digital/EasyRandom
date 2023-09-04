@Test
void generateCollectionOfSimpleDataWithSizeAndBouds(){
     List<Long> longs = new EasyRandom()
             .longs(streamSize:20,
randomNumberOrigin:13,
randomNumberBound:51)
             .boxed()
             .toList();

     assertThat(longs.size()).isEqualTo(20);
     assertThat(longs).allMatch(l->l>=13 && l<=51);
     System.out.println(longs);
}
