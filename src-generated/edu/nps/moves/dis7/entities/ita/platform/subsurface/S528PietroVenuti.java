package edu.nps.moves.dis7.entities.ita.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2611b9a3;
 * Country: Italy (ITA);
 * Entity kind: Platform;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 29493
 */
public class S528PietroVenuti extends EntityType
{
    /** Default constructor */
    public S528PietroVenuti()
    {
        setCountry(Country.ITALY_ITA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 18649, SS (Conventional Attack-Torpedo, Patrol)
        setSubCategory((byte)4); // uid 18663, Todaro Class (Type 212A)
        setSpecific((byte)3); // uid 29493, S528 Pietro Venuti
    }
}
