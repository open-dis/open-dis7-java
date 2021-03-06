package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@f29353f;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 10734
 */
public class JSTARSGroundStationModuleGSMANTSQ178 extends EntityType
{
    /** Default constructor */
    public JSTARSGroundStationModuleGSMANTSQ178()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)29); // uid 10728, Command, Control, Communications, and Intelligence (C3I) System
        setSubCategory((byte)6); // uid 10734, JSTARS Ground Station Module (GSM) AN/TSQ-178
    }
}
