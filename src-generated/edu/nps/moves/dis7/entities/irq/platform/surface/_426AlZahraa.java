package edu.nps.moves.dis7.entities.irq.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@61ce23ac;
 * Country: Iraq (IRQ);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 18015
 */
public class _426AlZahraa extends EntityType
{
    /** Default constructor */
    public _426AlZahraa()
    {
        setCountry(Country.IRAQ_IRQ);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 18013, Auxiliary
        setSubCategory((byte)1); // uid 18014, Transport Ship
        setSpecific((byte)1); // uid 18015, 426 Al Zahraa
    }
}
