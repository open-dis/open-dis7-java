package edu.nps.moves.dis7.entities.gbr.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@1a96d94c;
 * Country: United Kingdom of Great Britain and Northern Ireland (GBR);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 28139
 */
public class ChallengerMBTMark2GunVariant extends EntityType
{
    /** Default constructor */
    public ChallengerMBTMark2GunVariant()
    {
        setCountry(Country.UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)1); // uid 14882, Tank
        setSubCategory((byte)2); // uid 14884, Challenger MBT
        setSpecific((byte)2); // uid 14886, Mark II
        setExtra((byte)3); // uid 28139, Challenger MBT Mark 2 Gun Variant
    }
}
