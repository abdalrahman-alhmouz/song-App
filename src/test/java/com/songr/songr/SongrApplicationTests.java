package com.songr.songr;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

@SpringBootTest
class SongrApplicationTests {
    Album album=new Album("Hello","Adele","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ3_tgt-9eSrg_VBIqN1mmLl5lJ2f_a5fmi91t4gMvN3YV1QJ2FJou2QJ1-Q5-xHq1blgw&usqp=CAU",6.6,0);
    Song song=new Song("Hello",6,5,album);

		@Test
		void constructerTest () {
			assertThat(album instanceof Album).isEqualTo(true);
		}

		@Test
		void titleTest () {
			assertThat(album.getTitle()).isEqualTo("Hello");
		}

		@Test
		void artistTest () {
			assertThat(album.getArtist()).isEqualTo("Adele");
		}

		@Test
		void lengthTEst () {
			assertThat(album.getLength()).isEqualTo(6.6);
		}

		@Test
		void imageTest () {
			assertThat(album.getImageUrl()).isEqualTo("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ3_tgt-9eSrg_VBIqN1mmLl5lJ2f_a5fmi91t4gMvN3YV1QJ2FJou2QJ1-Q5-xHq1blgw&usqp=CAU");
		}

		@Test
		void countTest () {
			assertThat(album.getSongCount()).isEqualTo(0);
		}

		@Test
		void steTilte () {
			album.setTitle("sharkSong");
			assertThat(album.getTitle()).isEqualTo("sharkSong");
		}

		@Test
		void setArtist () {
			album.setArtist("reahna");
			assertThat(album.getArtist()).isEqualTo("reahna");
		}

		@Test
		void setLingth () {
			album.setLength(5.7);
			assertThat(album.getLength()).isEqualTo(5.7);
		}

		@Test
		void setImage() {
			album.setImageUrl("https://i.ytimg.com/vi/EemxFDFpFTU/maxresdefault.jpg");
			assertThat(album.getImageUrl()).isEqualTo("https://i.ytimg.com/vi/EemxFDFpFTU/maxresdefault.jpg");
		}

		@Test
		void setCount() {
			album.setSongCount(8);
			assertThat(album.getSongCount()).isEqualTo(8);
		}

//		____________________________________________________]]]
@Test
void songTest () {
    assertThat(song instanceof Song).isEqualTo(true);
}

//    @Test
//    void titleTest () {
//        assertThat(album.getTitle()).isEqualTo("Hello");
//    }
//
//    @Test
//    void artistTest () {
//        assertThat(album.getArtist()).isEqualTo("Adele");
//    }
//
//    @Test
//    void lengthTEst () {
//        assertThat(album.getLength()).isEqualTo(6.6);
//    }
//
//    @Test
//    void imageTest () {
//        assertThat(album.getImageUrl()).isEqualTo("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ3_tgt-9eSrg_VBIqN1mmLl5lJ2f_a5fmi91t4gMvN3YV1QJ2FJou2QJ1-Q5-xHq1blgw&usqp=CAU");
//    }
//
//    @Test
//    void countTest () {
//        assertThat(album.getSongCount()).isEqualTo(0);
//    }
//
//    @Test
//    void steTilte () {
//        album.setTitle("sharkSong");
//        assertThat(album.getTitle()).isEqualTo("sharkSong");
//    }
//
//    @Test
//    void setArtist () {
//        album.setArtist("reahna");
//        assertThat(album.getArtist()).isEqualTo("reahna");
//    }
//
//    @Test
//    void setLingth () {
//        album.setLength(5.7);
//        assertThat(album.getLength()).isEqualTo(5.7);
//    }
//
//    @Test
//    void setImage() {
//        album.setImageUrl("https://i.ytimg.com/vi/EemxFDFpFTU/maxresdefault.jpg");
//        assertThat(album.getImageUrl()).isEqualTo("https://i.ytimg.com/vi/EemxFDFpFTU/maxresdefault.jpg");
//    }
//
//    @Test
//    void setCount() {
//        album.setSongCount(8);
//        assertThat(album.getSongCount()).isEqualTo(8);
//    }

}