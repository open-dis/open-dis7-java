package edu.nps.moves.dis7.entities.ita.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@40e10ff8;
 * Country: Italy (ITA);
 * Entity kind: Platform;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 18652
 */
public class S523GiulianoPrini extends EntityType
{
    /** Default constructor */
    public S523GiulianoPrini()
    {
        setCountry(Country.ITALY_ITA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 18649, SS (Conventional Attack-Torpedo, Patrol)
        setSubCategory((byte)1); // uid 18650, Improved Sauro Class
        setSpecific((byte)2); // uid 18652, S 523 Giuliano Prini
    }
}
