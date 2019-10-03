// $XKeyboardConfig$

// "Carakan Keyboard Layout"
// This layout is designed for Javanese Carakan Script
// based on Tuladha Jejeg Unicode keyboard layout
// by R.S. Wihananto @ http://sites.google.com/site/jawaunicode/
// the font has been packaged in
// https://launchpad.net/~ubuntu+javanese+translators/+archive/ubuntu/ppa
// by: Slamet Badwi (slamet.badwi@gmail.com)

// *****************************************************************

partial default alphanumeric_keys modifier_keys 

xkb_symbols "javanese_unicode" {
    name[Group1]= "Carakan Unicode";
    key.type="THREE_LEVEL";	

// Alphanumeric section

    key <AB01> { [	UA99A	,	UA982	,	asciitilde		] };	
    key <AB02> { [	UA994	,	UA981	,	UA980		] };	
    key <AB03> { [	UA995	,	UA996	,	at		] };	
    key <AB04> { [	UA98A	,	UA98B	,	numbersign		] };	
    key <AB05> { [	UA9A7	,	UA9A8	,	dollar		] };	
    key <AB06> { [	UA9A4	,	UA99F	,	percent		] };	
    key <AB07> { [	UA9A9	,	UA9B3	,	j		] };	
    key <AB08> { [	UA9C8	,	UA9C7	,	comma		] };	
    key <AB09> { [	UA9C9	,	U200D	,	period		] };	
    key <AB10> { [	UA9C0	,	U200C	,	question		] };	
									
									
    key <AC01> { [	UA984	,	UA9B4  	,	UA9BB		] };	
    key <AC02> { [	UA9B1	,	UA9AF	,	UA9B0		] };	
    key <AC03> { [	UA9A2	,	UA9A3	,	ampersand		] };	
    key <AC04> { [	UA989	,	UA9BD	,	asterisk		] };	
    key <AC05> { [	UA992	,	UA993	,	less		] };	
    key <AC06> { [	UA9B2	,	UA983	,	greater		] };	
    key <AC07> { [	UA997	,	UA998	,	UA999		] };	
    key <AC08> { [	UA98F	,	UA991	,	quotedbl		] };	
    key <AC09> { [	UA9AD	,	UA9AD	,	colon		] };	
    key <AC10> { [ 	UA99B	,	UA99C	,	semicolon		] };	
    key <AC11> { [	UA99D	,	UA99E	,	quoteright		] };	
									
									
    key <AD01> { [	UA990	,	UA9BC	,	UA9AA		] };	
    key <AD02> { [	UA9AE	,	UA9AE	,	w		] };	
    key <AD03> { [	UA98C	,	UA9BA	,	UA98D		] };	
    key <AD04> { [	UA9AB	,	UA9BF	,	UA9AC		] };	
    key <AD05> { [	UA9A0	,	UA9A1	,	t		] };	
    key <AD06> { [	UA9AA	,	UA9BE	,	UA9B7		] };	
    key <AD07> { [	UA988	,	UA9B8	,	UA9B9		] };	
    key <AD08> { [	UA986	,	UA9B6	,	UA985		] };	
    key <AD09> { [	UA98E	,	UA9B4	,	UA9B5		] };	
    key <AD10> { [	UA9A5	,	UA9A6	,	slash		] };	
    key <AD11> { [	bracketleft	,	UA9C1	,	braceleft		] };	
    key <AD12> { [	bracketright	,	UA9C2	,	braceright		] };	
									
									
    key <AE01> { [	UA9D1	,	1	,	exclam		] };	
    key <AE02> { [	UA9D2	,	2	,	U0662		] };	
    key <AE03> { [	UA9D3	,	3	,	UA9C6		] };	
    key <AE04> { [	UA9D4	,	4	,	UA9DE		] };	
    key <AE05> { [	UA9D5	,	5	,	UA9DF		] };	
    key <AE06> { [	UA9D6	,	6	,	UA9C3		] };	
    key <AE07> { [	UA9D7	,	7	,	UA9C4		] };	
    key <AE08> { [	UA9D8	,	8	,	UA9C5		] };	
    key <AE09> { [	UA9D9	,	9	,	parenleft		] };	
    key <AE10> { [	UA9D0	,	0	,	parenright		] };	
    key <AE11> { [ 	UA98D	,	minus	,	underscore		] };	
    key <AE12> { [	UA987	,	equal	,	plus		] };	
									
    key <TLDE> { [	UA9CB	,	UA9CA	,	quoteleft		] };	
    key <BKSL> { [	UA9CC	,	UA9CD	,	bar		] };	
									
									
    key <ESC>  { [ Escape ] };

// End alphanumeric section

//    begin modifier mappings
//    modifier_map Shift  { Shift_L };
//    modifier_map Lock   { Caps_Lock };
//    modifier_map Control{ Control_L };
//    modifier_map Mod3   { Mode_switch };

    include "level3(ralt_switch)"

};

