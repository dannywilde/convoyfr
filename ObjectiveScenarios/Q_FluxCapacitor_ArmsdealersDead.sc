<?xml version="1.0" encoding="utf-8"?>
<Scenario xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
  <objectiveNumber>0</objectiveNumber>
  <scenarioType>Ambush</scenarioType>
  <FilePath>D:/Convoy/Assets/StreamingAssets/ObjectiveScenarios/Q_FluxCapacitor_ArmsdealersDead.sc</FilePath>
  <BiomeType>Road</BiomeType>
  <CombatEndDialog>1</CombatEndDialog>
  <StartDialog>0</StartDialog>
  <CurrentDialog>0</CurrentDialog>
  <ShowGUI>false</ShowGUI>
  <Dialogs>
    <Dialog>
      <GraphRect>
        <x>168</x>
        <y>414</y>
        <center>
          <x>244.5</x>
          <y>465.5</y>
        </center>
        <width>153</width>
        <height>103</height>
        <xMin>168</xMin>
        <yMin>414</yMin>
        <xMax>321</xMax>
        <yMax>517</yMax>
      </GraphRect>
      <Name>Start dialog</Name>
      <Text>You return to the laboratory and tell the professor about your success.

He looks elated, and happily exclaims:

"Ha-hah! Wonderful! Greatgreatgreat! I knew I could count on you.

So, the Flux Capacitor. Yesyes! I'll get one up and running for you to use on your spaceship, no problem!

Just wait here, I'll be right back!"</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="AddCargo">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>141</x>
                <y>65</y>
                <center>
                  <x>146</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>141</xMin>
                <yMin>65</yMin>
                <xMax>151</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>2</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>0</Amount>
            </ButtonAction>
          </Actions>
          <Name>Wait...</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>293</x>
        <y>692</y>
        <center>
          <x>368</x>
          <y>742</y>
        </center>
        <width>150</width>
        <height>100</height>
        <xMin>293</xMin>
        <yMin>692</yMin>
        <xMax>443</xMax>
        <yMax>792</yMax>
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
                <center>
                  <x>0</x>
                  <y>0</y>
                </center>
                <width>0</width>
                <height>0</height>
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
        <x>418</x>
        <y>401</y>
        <center>
          <x>496.5</x>
          <y>451</y>
        </center>
        <width>157</width>
        <height>100</height>
        <xMin>418</xMin>
        <yMin>401</yMin>
        <xMax>575</xMax>
        <yMax>501</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>After waiting a short while, the professor returns with a fully functional Flux Capacitor!

You safely stash it into your cargo hold, thank the professor and prepare to leave.</Text>
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
                <center>
                  <x>0</x>
                  <y>0</y>
                </center>
                <width>0</width>
                <height>0</height>
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
  <Name>Q_FluxCapacitor_ArmsdealersDead</Name>
</Scenario>