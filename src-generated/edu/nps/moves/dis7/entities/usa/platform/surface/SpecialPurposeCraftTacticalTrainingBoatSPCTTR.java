package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@66e827a8;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 26782
 */
public class SpecialPurposeCraftTacticalTrainingBoatSPCTTR extends EntityType
{
    /** Default constructor */
    public SpecialPurposeCraftTacticalTrainingBoatSPCTTR()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)63); // uid 12252, Coast Guard Boats
        setSubCategory((byte)16); // uid 26782, Special Purpose Craft Tactical Training Boat (SPC-TTR)
    }
}
