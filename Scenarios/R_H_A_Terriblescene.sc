﻿<?xml version="1.0" encoding="utf-8"?>
<Scenario xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
  <objectiveNumber>0</objectiveNumber>
  <scenarioType>Ambush</scenarioType>
  <FilePath>C:/Program Files (x86)/Unity/Convoy/Assets/StreamingAssets/Scenarios/R_H_A_Terriblescene.sc</FilePath>
  <BiomeType>Road</BiomeType>
  <CombatEndDialog>1</CombatEndDialog>
  <StartDialog>0</StartDialog>
  <CurrentDialog>0</CurrentDialog>
  <ShowGUI>false</ShowGUI>
  <Dialogs>
    <Dialog>
      <GraphRect>
        <x>-15</x>
        <y>273</y>
        <position>
          <x>-15</x>
          <y>273</y>
        </position>
        <center>
          <x>72</x>
          <y>337.5</y>
        </center>
        <min>
          <x>-15</x>
          <y>273</y>
        </min>
        <max>
          <x>159</x>
          <y>402</y>
        </max>
        <width>174</width>
        <height>129</height>
        <size>
          <x>174</x>
          <y>129</y>
        </size>
        <xMin>-15</xMin>
        <yMin>273</yMin>
        <xMax>159</xMax>
        <yMax>402</yMax>
      </GraphRect>
      <Name>Start dialog</Name>
      <Text>There's a wreck by the side of the road, surrounded by gore, blood and the corpses of a man and two children.

Evidently, you're in raider territory.</Text>
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
                <x>162</x>
                <y>65</y>
                <position>
                  <x>162</x>
                  <y>65</y>
                </position>
                <center>
                  <x>167</x>
                  <y>70</y>
                </center>
                <min>
                  <x>162</x>
                  <y>65</y>
                </min>
                <max>
                  <x>172</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>162</xMin>
                <yMin>65</yMin>
                <xMax>172</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>2</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Investigate the wreck.</Name>
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
          </Actions>
          <Name>Leave it be.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>25</x>
        <y>530</y>
        <position>
          <x>25</x>
          <y>530</y>
        </position>
        <center>
          <x>100</x>
          <y>580</y>
        </center>
        <min>
          <x>25</x>
          <y>530</y>
        </min>
        <max>
          <x>175</x>
          <y>630</y>
        </max>
        <width>150</width>
        <height>100</height>
        <size>
          <x>150</x>
          <y>100</y>
        </size>
        <xMin>25</xMin>
        <yMin>530</yMin>
        <xMax>175</xMax>
        <yMax>630</yMax>
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
          <Name>Take loot</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>230</x>
        <y>200</y>
        <position>
          <x>230</x>
          <y>200</y>
        </position>
        <center>
          <x>308.5</x>
          <y>264.5</y>
        </center>
        <min>
          <x>230</x>
          <y>200</y>
        </min>
        <max>
          <x>387</x>
          <y>329</y>
        </max>
        <width>157</width>
        <height>129</height>
        <size>
          <x>157</x>
          <y>129</y>
        </size>
        <xMin>230</xMin>
        <yMin>200</yMin>
        <xMax>387</xMax>
        <yMax>329</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>You discover several discarded pieces of clothing, presumably belonging to the mother of this family.

There's no sign of her, the raiders probably took her.</Text>
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
                <x>145</x>
                <y>65</y>
                <position>
                  <x>145</x>
                  <y>65</y>
                </position>
                <center>
                  <x>150</x>
                  <y>70</y>
                </center>
                <min>
                  <x>145</x>
                  <y>65</y>
                </min>
                <max>
                  <x>155</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>145</xMin>
                <yMin>65</yMin>
                <xMax>155</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>3</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Bury these people.</Name>
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
          </Actions>
          <Name>Roll out.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>496</x>
        <y>276</y>
        <position>
          <x>496</x>
          <y>276</y>
        </position>
        <center>
          <x>574.5</x>
          <y>326</y>
        </center>
        <min>
          <x>496</x>
          <y>276</y>
        </min>
        <max>
          <x>653</x>
          <y>376</y>
        </max>
        <width>157</width>
        <height>100</height>
        <size>
          <x>157</x>
          <y>100</y>
        </size>
        <xMin>496</xMin>
        <yMin>276</yMin>
        <xMax>653</xMax>
        <yMax>376</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Whilst it takes some time, the decent thing to do is give these people a place to rest.

Eventually, you finish and prepare to head out.</Text>
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
          <Name>Move out.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
  </Dialogs>
  <Name>R_H_A_Terriblescene</Name>
</Scenario>