package edu.nps.moves.dis7.entities.ita.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@a5b0b86;
 * Country: Italy (ITA);
 * Entity kind: Platform;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 18659
 */
public class S521GuglielmoMarconi extends EntityType
{
    /** Default constructor */
    public S521GuglielmoMarconi()
    {
        setCountry(Country.ITALY_ITA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 18649, SS (Conventional Attack-Torpedo, Patrol)
        setSubCategory((byte)2); // uid 18655, Sauro Class (1081 Type)
        setSpecific((byte)4); // uid 18659, S 521 Guglielmo Marconi
    }
}
