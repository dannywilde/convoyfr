﻿<?xml version="1.0" encoding="utf-8"?>
<Scenario xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
  <objectiveNumber>0</objectiveNumber>
  <scenarioType>Ambush</scenarioType>
  <FilePath>C:/Program Files (x86)/Unity/Convoy/Assets/StreamingAssets/Scenarios/G_D_S_Plague.sc</FilePath>
  <BiomeType>DesertRoad</BiomeType>
  <CombatEndDialog>1</CombatEndDialog>
  <StartDialog>0</StartDialog>
  <CurrentDialog>0</CurrentDialog>
  <ShowGUI>false</ShowGUI>
  <Dialogs>
    <Dialog>
      <GraphRect>
        <x>183</x>
        <y>431</y>
        <position>
          <x>183</x>
          <y>431</y>
        </position>
        <center>
          <x>332</x>
          <y>526.5</y>
        </center>
        <min>
          <x>183</x>
          <y>431</y>
        </min>
        <max>
          <x>481</x>
          <y>622</y>
        </max>
        <width>298</width>
        <height>191</height>
        <size>
          <x>298</x>
          <y>191</y>
        </size>
        <xMin>183</xMin>
        <yMin>431</yMin>
        <xMax>481</xMax>
        <yMax>622</yMax>
      </GraphRect>
      <Name>Start dialog</Name>
      <Text>The radio signal originated from a lone man carrying a radio beacon.

"Hi fella, my name's Guy," he says, "I need some help!"</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>286</x>
                <y>65</y>
                <position>
                  <x>286</x>
                  <y>65</y>
                </position>
                <center>
                  <x>291</x>
                  <y>70</y>
                </center>
                <min>
                  <x>286</x>
                  <y>65</y>
                </min>
                <max>
                  <x>296</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>286</xMin>
                <yMin>65</yMin>
                <xMax>296</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>2</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>What do you need?</Name>
        </DialogButton>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>286</x>
                <y>109</y>
                <position>
                  <x>286</x>
                  <y>109</y>
                </position>
                <center>
                  <x>291</x>
                  <y>114</y>
                </center>
                <min>
                  <x>286</x>
                  <y>109</y>
                </min>
                <max>
                  <x>296</x>
                  <y>119</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>286</xMin>
                <yMin>109</yMin>
                <xMax>296</xMax>
                <yMax>119</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>3</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Sure, but it'll cost you...</Name>
        </DialogButton>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>286</x>
                <y>153</y>
                <position>
                  <x>286</x>
                  <y>153</y>
                </position>
                <center>
                  <x>291</x>
                  <y>158</y>
                </center>
                <min>
                  <x>286</x>
                  <y>153</y>
                </min>
                <max>
                  <x>296</x>
                  <y>163</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>286</xMin>
                <yMin>153</yMin>
                <xMax>296</xMax>
                <yMax>163</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>4</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
            <ButtonAction xsi:type="CloseDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>0</x>
                <y>0</y>
                <position>
                  <x>0</x>
                  <y>0</y>
                </position>
                <center>
                  <x>0</x>
                  <y>0</y>
                </center>
                <min>
                  <x>0</x>
                  <y>0</y>
                </min>
                <max>
                  <x>0</x>
                  <y>0</y>
                </max>
                <width>0</width>
                <height>0</height>
                <size>
                  <x>0</x>
                  <y>0</y>
                </size>
                <xMin>0</xMin>
                <yMin>0</yMin>
                <xMax>0</xMax>
                <yMax>0</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Not interested.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>335</x>
        <y>693</y>
        <position>
          <x>335</x>
          <y>693</y>
        </position>
        <center>
          <x>410</x>
          <y>743</y>
        </center>
        <min>
          <x>335</x>
          <y>693</y>
        </min>
        <max>
          <x>485</x>
          <y>793</y>
        </max>
        <width>150</width>
        <height>100</height>
        <size>
          <x>150</x>
          <y>100</y>
        </size>
        <xMin>335</xMin>
        <yMin>693</yMin>
        <xMax>485</xMax>
        <yMax>793</yMax>
      </GraphRect>
      <Name>Loot dialog</Name>
      <Text>[0loot]</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="AddLoot">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>0</x>
                <y>0</y>
                <position>
                  <x>0</x>
                  <y>0</y>
                </position>
                <center>
                  <x>0</x>
                  <y>0</y>
                </center>
                <min>
                  <x>0</x>
                  <y>0</y>
                </min>
                <max>
                  <x>0</x>
                  <y>0</y>
                </max>
                <width>0</width>
                <height>0</height>
                <size>
                  <x>0</x>
                  <y>0</y>
                </size>
                <xMin>0</xMin>
                <yMin>0</yMin>
                <xMax>0</xMax>
                <yMax>0</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <Amount>0</Amount>
            </ButtonAction>
          </Actions>
          <Name>Take loot.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>625</x>
        <y>246</y>
        <position>
          <x>625</x>
          <y>246</y>
        </position>
        <center>
          <x>891.5</x>
          <y>321.699219</y>
        </center>
        <min>
          <x>625</x>
          <y>246</y>
        </min>
        <max>
          <x>1158</x>
          <y>397.398438</y>
        </max>
        <width>533</width>
        <height>151.398438</height>
        <size>
          <x>533</x>
          <y>151.398438</y>
        </size>
        <xMin>625</xMin>
        <yMin>246</yMin>
        <xMax>1158</xMax>
        <yMax>397.398438</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"My cousin lives in the town of Colonya, and a plague has reared its ugly head. The courier carrying the cure won't respond. Will you help?" </Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="AddSideObjective">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>521</x>
                <y>65</y>
                <position>
                  <x>521</x>
                  <y>65</y>
                </position>
                <center>
                  <x>526</x>
                  <y>70</y>
                </center>
                <min>
                  <x>521</x>
                  <y>65</y>
                </min>
                <max>
                  <x>531</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>521</xMin>
                <yMin>65</yMin>
                <xMax>531</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <nodeName>W_Plague_NodeA</nodeName>
              <objective>
                <nodeIndex>0</nodeIndex>
                <name>Purging the Plague</name>
                <discription>A man named Guy has asked you to help the town of Colonya deal with a plague.

You should track down the courier carrying the plague cure.</discription>
                <number>10</number>
                <nodes />
                <state>Start</state>
              </objective>
              <pos>Random</pos>
              <distance>0</distance>
            </ButtonAction>
          </Actions>
          <Name>These plague people need their cure, I'd be glad to help!</Name>
        </DialogButton>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="CloseDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>0</x>
                <y>0</y>
                <position>
                  <x>0</x>
                  <y>0</y>
                </position>
                <center>
                  <x>0</x>
                  <y>0</y>
                </center>
                <min>
                  <x>0</x>
                  <y>0</y>
                </min>
                <max>
                  <x>0</x>
                  <y>0</y>
                </max>
                <width>0</width>
                <height>0</height>
                <size>
                  <x>0</x>
                  <y>0</y>
                </size>
                <xMin>0</xMin>
                <yMin>0</yMin>
                <xMax>0</xMax>
                <yMax>0</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>521</x>
                <y>127</y>
                <position>
                  <x>521</x>
                  <y>127</y>
                </position>
                <center>
                  <x>526</x>
                  <y>132</y>
                </center>
                <min>
                  <x>521</x>
                  <y>127</y>
                </min>
                <max>
                  <x>531</x>
                  <y>137</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>521</xMin>
                <yMin>127</yMin>
                <xMax>531</xMax>
                <yMax>137</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>4</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>No, I don't want anything to do with plague people! </Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>687</x>
        <y>453</y>
        <position>
          <x>687</x>
          <y>453</y>
        </position>
        <center>
          <x>875.5</x>
          <y>526.5</y>
        </center>
        <min>
          <x>687</x>
          <y>453</y>
        </min>
        <max>
          <x>1064</x>
          <y>600</y>
        </max>
        <width>377</width>
        <height>147</height>
        <size>
          <x>377</x>
          <y>147</y>
        </size>
        <xMin>687</xMin>
        <yMin>453</yMin>
        <xMax>1064</xMax>
        <yMax>600</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"A reward?

My cousin lives in the town of Colonya, and a plague has reared its ugly head. The courier carrying the cure won't respond. Will you help?

I won't be able to pay you for your efforts, but the people of Colonya are bound to be grateful!" </Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="AddSideObjective">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>365</x>
                <y>65</y>
                <position>
                  <x>365</x>
                  <y>65</y>
                </position>
                <center>
                  <x>370</x>
                  <y>70</y>
                </center>
                <min>
                  <x>365</x>
                  <y>65</y>
                </min>
                <max>
                  <x>375</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>365</xMin>
                <yMin>65</yMin>
                <xMax>375</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <nodeName>W_Plague_NodeA</nodeName>
              <objective>
                <nodeIndex>0</nodeIndex>
                <name>Purging the Plague</name>
                <discription>A man named Guy has asked you to help the town of Colonya deal with a plague.

You should track down the courier carrying the plague cure.</discription>
                <number>5</number>
                <nodes />
                <state>Start</state>
              </objective>
              <pos>Random</pos>
              <distance>0</distance>
            </ButtonAction>
          </Actions>
          <Name>These plague people need their cure, I'd be glad to help!</Name>
        </DialogButton>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>365</x>
                <y>109</y>
                <position>
                  <x>365</x>
                  <y>109</y>
                </position>
                <center>
                  <x>370</x>
                  <y>114</y>
                </center>
                <min>
                  <x>365</x>
                  <y>109</y>
                </min>
                <max>
                  <x>375</x>
                  <y>119</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>365</xMin>
                <yMin>109</yMin>
                <xMax>375</xMax>
                <yMax>119</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>4</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
            <ButtonAction xsi:type="CloseDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>0</x>
                <y>0</y>
                <position>
                  <x>0</x>
                  <y>0</y>
                </position>
                <center>
                  <x>0</x>
                  <y>0</y>
                </center>
                <min>
                  <x>0</x>
                  <y>0</y>
                </min>
                <max>
                  <x>0</x>
                  <y>0</y>
                </max>
                <width>0</width>
                <height>0</height>
                <size>
                  <x>0</x>
                  <y>0</y>
                </size>
                <xMin>0</xMin>
                <yMin>0</yMin>
                <xMax>0</xMax>
                <yMax>0</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>No, I don't want anything to do with plague people!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>1316</x>
        <y>680</y>
        <position>
          <x>1316</x>
          <y>680</y>
        </position>
        <center>
          <x>1397.5</x>
          <y>730</y>
        </center>
        <min>
          <x>1316</x>
          <y>680</y>
        </min>
        <max>
          <x>1479</x>
          <y>780</y>
        </max>
        <width>163</width>
        <height>100</height>
        <size>
          <x>163</x>
          <y>100</y>
        </size>
        <xMin>1316</xMin>
        <yMin>680</yMin>
        <xMax>1479</xMax>
        <yMax>780</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>You start your engines and drive off, leaving Guy a sad speck in the distance.</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="CloseDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>0</x>
                <y>0</y>
                <position>
                  <x>0</x>
                  <y>0</y>
                </position>
                <center>
                  <x>0</x>
                  <y>0</y>
                </center>
                <min>
                  <x>0</x>
                  <y>0</y>
                </min>
                <max>
                  <x>0</x>
                  <y>0</y>
                </max>
                <width>0</width>
                <height>0</height>
                <size>
                  <x>0</x>
                  <y>0</y>
                </size>
                <xMin>0</xMin>
                <yMin>0</yMin>
                <xMax>0</xMax>
                <yMax>0</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Onwards!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
  </Dialogs>
  <Name>G_D_S_Plague</Name>
</Scenario>