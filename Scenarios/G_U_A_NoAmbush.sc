﻿<?xml version="1.0" encoding="utf-8"?>
<Scenario xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
  <objectiveNumber>0</objectiveNumber>
  <scenarioType>Ambush</scenarioType>
  <FilePath>C:/Program Files (x86)/Unity/Convoy/Assets/StreamingAssets/Scenarios/G_U_A_NoAmbush.sc</FilePath>
  <BiomeType>Road</BiomeType>
  <CombatEndDialog>1</CombatEndDialog>
  <StartDialog>0</StartDialog>
  <CurrentDialog>0</CurrentDialog>
  <ShowGUI>false</ShowGUI>
  <Dialogs>
    <Dialog>
      <GraphRect>
        <x>600</x>
        <y>356</y>
        <position>
          <x>600</x>
          <y>356</y>
        </position>
        <center>
          <x>692.5</x>
          <y>406.5</y>
        </center>
        <min>
          <x>600</x>
          <y>356</y>
        </min>
        <max>
          <x>785</x>
          <y>457</y>
        </max>
        <width>185</width>
        <height>101</height>
        <size>
          <x>185</x>
          <y>101</y>
        </size>
        <xMin>600</xMin>
        <yMin>356</yMin>
        <xMax>785</xMax>
        <yMax>457</yMax>
      </GraphRect>
      <Name>Start dialog</Name>
      <Text>As you drive around the abandoned city, you realize all these alleyways and streets would be the perfect ambush location.</Text>
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
                <x>173</x>
                <y>65</y>
                <position>
                  <x>173</x>
                  <y>65</y>
                </position>
                <center>
                  <x>178</x>
                  <y>70</y>
                </center>
                <min>
                  <x>173</x>
                  <y>65</y>
                </min>
                <max>
                  <x>183</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>173</xMin>
                <yMin>65</yMin>
                <xMax>183</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>2</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Keep your eyes peeled.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>725</x>
        <y>582</y>
        <position>
          <x>725</x>
          <y>582</y>
        </position>
        <center>
          <x>800</x>
          <y>632</y>
        </center>
        <min>
          <x>725</x>
          <y>582</y>
        </min>
        <max>
          <x>875</x>
          <y>682</y>
        </max>
        <width>150</width>
        <height>100</height>
        <size>
          <x>150</x>
          <y>100</y>
        </size>
        <xMin>725</xMin>
        <yMin>582</yMin>
        <xMax>875</xMax>
        <yMax>682</yMax>
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
        <x>966</x>
        <y>294</y>
        <position>
          <x>966</x>
          <y>294</y>
        </position>
        <center>
          <x>1044.5</x>
          <y>344</y>
        </center>
        <min>
          <x>966</x>
          <y>294</y>
        </min>
        <max>
          <x>1123</x>
          <y>394</y>
        </max>
        <width>157</width>
        <height>100</height>
        <size>
          <x>157</x>
          <y>100</y>
        </size>
        <xMin>966</xMin>
        <yMin>294</yMin>
        <xMax>1123</xMax>
        <yMax>394</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>There doesn't seem to be any activity.

It's always good to be prepared though.</Text>
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
  <Name>G_U_A_NoAmbush</Name>
</Scenario>