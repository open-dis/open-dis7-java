package edu.nps.moves.dis7.entities.arg.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@6ae40994;
 * Country: Argentina (ARG);
 * Entity kind: Platform;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 18762
 */
public class SantaCruzTR1700ClassSS extends EntityType
{
    /** Default constructor */
    public SantaCruzTR1700ClassSS()
    {
        setCountry(Country.ARGENTINA_ARG);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 18761, SS (Conventional Attack - Torpedo, Patrol
        setSubCategory((byte)1); // uid 18762, Santa Cruz (TR 1700) Class (SS)
    }
}
