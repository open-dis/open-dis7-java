package edu.nps.moves.dis7.entities.aut.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3796751b;
 * Country: Austria (AUT);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 23522
 */
public class PandurII8x8 extends EntityType
{
    /** Default constructor */
    public PandurII8x8()
    {
        setCountry(Country.AUSTRIA_AUT);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 23518, Armored Fighting Vehicle - (IFV, APC, SP mortars, armored cars, chemical reconnaissance, Anti-Tank guided missile launchers, etc.)
        setSubCategory((byte)1); // uid 23519, Pandur
        setSpecific((byte)3); // uid 23522, Pandur II 8x8
    }
}
