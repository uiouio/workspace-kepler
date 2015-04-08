/*
 * exchprot.h
 *
 *  Created on: 2014��5��22��
 *      Author: ycq
 */

#ifndef _EXCHPROT_H_
#define _EXCHPROT_H_ 1

#pragma pack(1)
struct ExchHead {
	unsigned char tag;
	unsigned int srcid;
	unsigned int dstid;
	unsigned short msgid;
	unsigned int seqid;
	unsigned int length;
};

struct ExchTail {
	unsigned char crc;
	unsigned char tag;
};

struct ExchGenRsp {
	unsigned int  seq;
	unsigned char res;
};

struct ExchString {
	unsigned char len;
	unsigned char val[0];
};

struct ExchItem {
	unsigned int key;
	unsigned int len;
	unsigned char val[0];
};

struct ExchPlatHead {
	unsigned short msgid;
};

struct ExchTermHead {
	unsigned short msgid;
	char mobile[12];
};

struct ExchLogin {
	char username[16];
	char password[32];
};

struct ExchSubUnits {
	unsigned char cmd;
	unsigned char num;
	unsigned int ids[0];
};

struct ExchSubCmdid {
	unsigned char cmd;
	unsigned char num;
	unsigned short ids[0];
};

struct ExchTerminalReg {
	unsigned char result;
	unsigned short province;
	unsigned short city;
	unsigned char produceid[5];
	unsigned char termtype[20];
	unsigned char termid[7];
	unsigned char color;
	unsigned char plate[0];
};

struct ExchTerminalAuth {
	unsigned char result;
	unsigned char akey[0];
};

struct ExchGpsData {
	unsigned int warn;
	unsigned int stat;
	unsigned int lat;
	unsigned int lon;
	unsigned short height;
	unsigned short speed;
	unsigned short direction;
	unsigned char time[6];
};

struct ExchMMEvent {
	unsigned int mmid;
	unsigned char mmtype;
	unsigned char mmcode;
	unsigned char event;
	unsigned char cameraid;
};

struct ExchMMData {
	unsigned int mmid;
	unsigned char mmtype;
	unsigned char mmcode;
	unsigned char event;
	unsigned char cameraid;
	ExchGpsData gps;
	unsigned char pic[0];
};

struct ExchDriverEvent {
	unsigned char type;
	ExchGpsData begin;
	ExchGpsData end;
};

struct ExchTTData {
	unsigned char type;
	unsigned char data[0];
};

struct ExchBaseTab {
	unsigned char type;
	unsigned char data[0];
};

struct AddInfoSpeed {
	unsigned char type;
	unsigned int id[0];
};

struct AddInfoInout {
	unsigned char type;
	unsigned int id;
	unsigned char flag;
};

struct AddInfoLonger {
	unsigned int id;
	unsigned short tv;
	unsigned char flag;
};
#pragma pack()
#endif//_EXCHPROT_H_
