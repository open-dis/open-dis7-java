package edu.nps.moves.dis7.entities.gbr.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@11900483;
 * Country: United Kingdom of Great Britain and Northern Ireland (GBR);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 32340
 */
public class WarriorBGHQChobhamArmour extends EntityType
{
    /** Default constructor */
    public WarriorBGHQChobhamArmour()
    {
        setCountry(Country.UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 14887, Armored Fighting Vehicle
        setSubCategory((byte)8); // uid 14897, FV 510 Warrior
        setSpecific((byte)1); // uid 28140, Warrior BG HQ Command Variant (FV 511)
        setExtra((byte)1); // uid 32340, Warrior BG HQ Chobham Armour
    }
}
