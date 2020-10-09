package edu.nps.moves.dis7.entities.esp.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@65c33b92
 * Country: Spain (ESP)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 19030
 */
public class A04MartinPosadillo extends EntityType
{
    public A04MartinPosadillo()
    {
        setCountry(Country.SPAIN_ESP);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 19026, Auxiliary
        setSubCategory((byte)2); // uid 19029, Transport Ship (AP)
        setSpecific((byte)1); // uid 19030, A04 Martin Posadillo
    }
}
