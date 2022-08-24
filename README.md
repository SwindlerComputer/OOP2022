# OOP2022
My OOP assignment
Name: Nelson Ude
Student Number: C20479276

Description: The program is like a planet orbit while you are inside a spaceship in first person mode. Mixture of that with the previous group project that was done this summer with group. Where the user is inside a ship but instead of third person you are in first person and can't move side to side like the previous one.

Instructions: The main instructions are using the buttons 'J' and 'L'. When the program runs you use 'L' to go at full speed and 'J' to go back to normal speed or as you are doing this you can repeatedly press on both keys at the same time to see a difference in when the particles are being dispersed. Then you have your mouse that you can use to click on options for next,previous or pause/play.

How it works: When the program is run the user is in space stars/particles are dispersed while a radar is constantly moving each time the user then uses 'L' and 'J' to change the speed levels of them and Also some moving circles which was supposed to be planets moving around. Then there is a signal system and the waves keep a reading, The user then has options to click on for music. When the program runs music starts to play in the background and the user can then decide to pause or play the music and also switch to the next with the option next. If the user wants to go back and change the song they can selecte 'Prev' and the previous song will play from where the user was listening to it before (The position of song before skipped).

What I am most proud of in the assignment: I am most proud of the music system for this program because I struggled at the start to find a way to insert it. I struggled to run the whole program due to issues with the MAC but if I am picking one it would be the music because I tried many ways but the program kept saying null or error even though everything was correct but after finally understanding the path of the files and the right mp3 everything started to work fine. I am proud that I manged to understand the MAC's differeces with paths.



Youtube Video: https://youtu.be/V6XUXUvQu_U



This is code:

public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}



So is this without specifying the language:

public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
